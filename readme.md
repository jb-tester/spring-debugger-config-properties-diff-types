https://youtrack.jetbrains.com/issue/IDEA-374061
Spring Debugger: navigation to source doesn't work for properties of List or Map type, set in YAML

the watches to try:
``xml
<watches-manager>
      <configuration name="SpringBootApplicationConfigurationType">
        <watch expression="custom.config.prop2" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop2[0]" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop2[1]" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop3" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop3[1]" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop4" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop4.key1" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop4.key4" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop5.prop0" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop5.prop1" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop5.prop2[1]" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop5.prop3[1]" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop5.prop4.key2" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop5.prop4.key1" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop2[0]" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop6[1].prop0" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop7.key1.prop1" language="Spring Debugger Properties" />
        <watch expression="custom.config.prop7.key3.prop1" language="Spring Debugger Properties" />
      </configuration>
    </watches-manager>
``