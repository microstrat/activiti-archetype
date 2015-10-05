![Micro Strategies Logo](http://www.microstrat.com/sites/default/files/Micro_final_log_with_tag_horizontal_gradientSmall_0.jpg)

![Activiti Logo](http://www.activiti.org/images/activiti_logo.png)

# Activiti Enterprise Archetype

This is the home of the Activiti Enterprise Archetype.  This is an [Apache Maven](http://maven.apache.org/) archetype 
to create a base project from which to create extensions to Activiti Enterprise.  These extensions can include task
listeners, event listeners, custom REST calls, etc.

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