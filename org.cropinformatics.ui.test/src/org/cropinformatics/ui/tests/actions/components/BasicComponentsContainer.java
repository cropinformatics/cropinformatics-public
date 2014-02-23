/*******************************************************************************
 * Copyright 2007 International Rice Research Institute (IRRI) and 
 * Centro Internacional de Mejoramiento de Maiz y Trigo (CIMMYT). 
 * Original author Guy Davenport (guy.davenport@cropinformatics.com) under contract by
 * CIMMYT. Additional modifications by Guy Davenport after 21 November 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cropinformatics.ui.tests.actions.components;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.cropinformatics.common.BaseIdentification;
import org.cropinformatics.common.Identification;
import org.cropinformatics.ui.components.Component;
import org.cropinformatics.ui.components.impl.AbstractConfigurableContainer;
import org.cropinformatics.ui.components.impl.BooleanEditComponent;
import org.cropinformatics.ui.components.impl.DateEditComponent;
import org.cropinformatics.ui.components.impl.DelimiterStringEditComponent;
import org.cropinformatics.ui.components.impl.FileEditComponent;
import org.cropinformatics.ui.components.impl.IdentificationEditComponent;
import org.cropinformatics.ui.components.impl.IntegerEditComponent;
import org.cropinformatics.ui.components.impl.MultiLineTextEditComponent;
import org.cropinformatics.ui.components.impl.Option;
import org.cropinformatics.ui.components.impl.Options;
import org.cropinformatics.ui.components.impl.OptionsComponentWithButtons;
import org.cropinformatics.ui.components.impl.OptionsComponentWithCombo;
import org.cropinformatics.ui.components.impl.TextEditComponent;
import org.cropinformatics.ui.configuration.ComponentConfiguration;
import org.cropinformatics.ui.configuration.ContainerConfiguration;
import org.eclipse.swt.widgets.Composite;

public class BasicComponentsContainer extends AbstractConfigurableContainer<ContainerConfiguration>
{
	public static final String BOOLEAN_COMPONENT_ID = "booleanComponent";

	public static final String INTEGER_COMPONENT_ID = "integerComponent";

	public static final String STRING_COMPONENT_ID = "stringComponent";

	public static final String TEXT_COMPONENT_ID = "textComponent";

	public static final String DATE_COMPONENT_ID = "dateComponent";

	public static final String OPTIONS_WITH_BUTTONS_COMPONENT_ID = "optionsWithButtonsComponent";
	
	public static final String OPTIONS_WITH_BUTTONS_COMPONENT_ID2 = "optionsWithButtonsComponent2";

	public static final String OPTIONS_WITH_COMBO_COMPONENT_ID = "optionsWithComboComponent";

	public static final String FILE_COMPONENT_ID = "fileComponent";

	public static final String DELIMITER_COMPONENT_ID = "delimiterComponent";
	
	public static final String IDENTIFICATION_COMPONENT_ID = "identificationComponent";

	private PropertyChangeListener propertyChangedListener;

	private Options options;

	private OptionsComponentWithCombo optionsComponentWithCombo;

	private FileEditComponent fileComponent;

	private OptionsComponentWithButtons optionsComponentWithButtons;

	private BooleanEditComponent booleanEditComponent;

	private IntegerEditComponent integerEditComponent;

	private TextEditComponent stringEditComponent;

	private DateEditComponent dateEditComponent;

	private MultiLineTextEditComponent textStringEditComponent;

	private DelimiterStringEditComponent delimiterStringEditComponent;

	private IdentificationEditComponent<Identification> identificationEditComponent;

	public BasicComponentsContainer(Composite parent,
			ContainerConfiguration configuration)
	{
		super(parent, configuration);

		propertyChangedListener = new PropertyChangeListener()
		{
			public void propertyChange(PropertyChangeEvent event)
			{
				handlePropertyChanged() ;
				// TODO perhaps should be handled as a new separate event
				getPropertyChangeSupport().firePropertyChange(event) ;
			}
		};

		options = new Options("Colour Options", true) ;

		options.addOption(new Option("Red", "Red", 0)) ;
		options.addOption(new Option("Green","Green", 1)) ;
		options.addOption(new Option("Blue", "Blue", 2)) ;
		options.addOption(new Option("Black", "Black", 3)) ;
		options.addOption(new Option("White", "White", 4)) ;

		options.setDefaultOption(0) ;
	}

	protected Component<? extends ComponentConfiguration> initialiseChildComponent(Composite parent,
			ComponentConfiguration childConfiguration, String id)
	{
		Component<? extends ComponentConfiguration> component = null ;
		ContainerConfiguration containerConfiguration = null;

		if (childConfiguration instanceof ContainerConfiguration)
			containerConfiguration = (ContainerConfiguration)childConfiguration ;

		if (BOOLEAN_COMPONENT_ID.equals(id))
		{
			booleanEditComponent = new BooleanEditComponent(parent, containerConfiguration, "Boolean Edit Component", true) ;
			booleanEditComponent.initialise() ;
			booleanEditComponent.addPropertyChangeListener(propertyChangedListener) ;

			component = booleanEditComponent ;
		}
		else
		{
			if (INTEGER_COMPONENT_ID.equals(id))
			{
				integerEditComponent = new IntegerEditComponent(parent, containerConfiguration, "Integer Edit Component", 10) ;
				integerEditComponent.initialise() ;
				integerEditComponent.addPropertyChangeListener(propertyChangedListener) ;   

				component = integerEditComponent ;
			}
			else
			{
				if (STRING_COMPONENT_ID.equals(id))
				{
					stringEditComponent = new TextEditComponent(parent, containerConfiguration, "String Edit Component", "Test string") ;
					stringEditComponent.initialise() ;
					stringEditComponent.addPropertyChangeListener(propertyChangedListener) ;  

					component = stringEditComponent ;
				}
				else
				{
					if (TEXT_COMPONENT_ID.equals(id))
					{
						textStringEditComponent = new MultiLineTextEditComponent(parent, containerConfiguration, "Text Edit Component", "This is a test of the Text Edit Component") ;
						textStringEditComponent.initialise() ;
						textStringEditComponent.addPropertyChangeListener(propertyChangedListener) ;  

						component = textStringEditComponent ;
					}
					else
					{
						if (DATE_COMPONENT_ID.equals(id))
						{
							dateEditComponent = createDateEditComponent(parent, containerConfiguration, "Date Edit Component", new Date()) ;
							dateEditComponent.initialise() ;
							dateEditComponent.addPropertyChangeListener(propertyChangedListener) ;    

							component = dateEditComponent ;
						}
						else
						{
							if (OPTIONS_WITH_COMBO_COMPONENT_ID.equals(id))
							{
								optionsComponentWithCombo = new OptionsComponentWithCombo(parent, containerConfiguration, options) ;
								optionsComponentWithCombo.initialise() ;
								optionsComponentWithCombo.addPropertyChangeListener(propertyChangedListener) ;    

								component = optionsComponentWithCombo ;
							}
							else
							{
								if (OPTIONS_WITH_BUTTONS_COMPONENT_ID.equals(id))
								{
									optionsComponentWithButtons = new OptionsComponentWithButtons(parent, containerConfiguration, options) ;

									optionsComponentWithButtons.initialise() ;
									optionsComponentWithButtons.addPropertyChangeListener(propertyChangedListener) ;  

									component = optionsComponentWithButtons ;
								}
								else
								{
									if (FILE_COMPONENT_ID.equals(id))
									{
										fileComponent = new FileEditComponent(parent, containerConfiguration, "File name", "Browse..", null, new String[] {"*.txt"}, true) ;
										fileComponent.initialise() ;

										fileComponent.addPropertyChangeListener(propertyChangedListener) ;

										component = fileComponent ;
									}
									else
									{
										if (DELIMITER_COMPONENT_ID.equals(id))
										{
											delimiterStringEditComponent = new DelimiterStringEditComponent(parent, containerConfiguration, "Delimiter Component", String.valueOf('\t')) ;
											delimiterStringEditComponent.initialise() ;

											delimiterStringEditComponent.addPropertyChangeListener(propertyChangedListener) ;

											component = delimiterStringEditComponent ;
										}
										else
										{
											if (OPTIONS_WITH_BUTTONS_COMPONENT_ID2.equals(id))
											{
												optionsComponentWithButtons = new OptionsComponentWithButtons(parent, containerConfiguration, options) ;

												optionsComponentWithButtons.initialise() ;
												optionsComponentWithButtons.addPropertyChangeListener(propertyChangedListener) ;  

												component = optionsComponentWithButtons ;
											}
											else
											{
												if (IDENTIFICATION_COMPONENT_ID.equals(id))
												{
													Identification simpleIdentifer = new BaseIdentification("Simple Identifier Name") ;

													identificationEditComponent = new IdentificationEditComponent<Identification>(parent, containerConfiguration, simpleIdentifer) ;
													identificationEditComponent.initialise() ;

													identificationEditComponent.addPropertyChangeListener(propertyChangedListener) ;

													component = identificationEditComponent ;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

		return component ;
	}
	
	@Override
	protected void registerChildComponentIDs()
	{
		super.registerChildComponentIDs();

		registerChildComponentID(BOOLEAN_COMPONENT_ID);
		registerChildComponentID(INTEGER_COMPONENT_ID);
		registerChildComponentID(STRING_COMPONENT_ID);
		registerChildComponentID(TEXT_COMPONENT_ID);
		registerChildComponentID(DATE_COMPONENT_ID);
		registerChildComponentID(OPTIONS_WITH_BUTTONS_COMPONENT_ID);
		registerChildComponentID(OPTIONS_WITH_BUTTONS_COMPONENT_ID2);
		registerChildComponentID(OPTIONS_WITH_COMBO_COMPONENT_ID);
		registerChildComponentID(FILE_COMPONENT_ID);
		registerChildComponentID(DELIMITER_COMPONENT_ID);
		registerChildComponentID(IDENTIFICATION_COMPONENT_ID);
	}

	private void handlePropertyChanged() 
	{

	}

	@Override
	protected ContainerConfiguration getDefaultConfiguration()
	{
		return null;
	}
}
