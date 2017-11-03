![Micro Strategies Logo](http://www.microstrat.com/sites/default/files/Micro_final_log_with_tag_horizontal_gradientSmall_0.jpg)

![Alfresco Logo](https://cdn-www.activiti.org/sites/default/files/styles/contributor_logo/public/logo-alfresco%402x.png?itok=-RUVoXeZ)

# Alfresco Process Services Archetype

This is the home of the Alfresco Process Services Archetype (formerly Activiti Enterprise Archetype).  This is an 
[Apache Maven](http://maven.apache.org/) archetype to create a base project from which to create extensions to Alfresco
Process Services.  These extensions can include task listeners, event listeners, custom REST calls, etc.

The approach is relatively simple and should be usable within the major IDE's.  It has specifically been validated
with IntelliJ Ultimate 14.1.4/14.1.5 and Eclipse Mars 4.5.0 but should work with any Maven enabled IDE.

The archetype will create two projects:

+ activiti-app
  - This is the activiti-app WAR that can be run within a container.
  - This will include your extension project.
+ {artifact id}-ext
  - {artifact id} will be replaced by whatever you name the root artifact.
  - This is the extension project where extensions will be placed.
  - It is possible to add multiple extension projects however they must be added to the activiti-app project.
  
## Videos

+ [Activiti Archetype for Eclipse](http://bit.ly/1UhEjIl)

## License

This project is released under the [Apache License, Version 2.0] (http://www.apache.org/licenses/LICENSE-2.0.html).

## Next Steps

As this is the initial release there are a number of things that still need to be done.  The biggest things are more
logistical such as:

+ Usage documentation needs to be written and made available.
+ Supplementary documentation like How-to blogs and videos.
+ Adding samples to work from.
+ (Optional) Add a runner.