/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class JasperreportsGriffonPlugin {
    // the plugin version
    String version = '0.1'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-jasperreports-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'JasperReports integration'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Provides integration with [JasperReports][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*       | *Type*                                |
| ------------ | ------------------------------------- |
| reportViewer | `net.sf.jasperreports.swing.JRViewer` |

This node supports the following properties

 * **jasperPrint** - of type `net.sf.jasperreports.engine.JasperPrint`
 * **inputStream** - of type `java.io.InputStream`
 * **isXml** - boolean, if the report is in XML format or not (only used if inputstream is provided)
 * **locale** - of type `java.util.Locale`
 * **resourceBundle* - of type `java.util.ResourceBundle`

Either set a value for `jasperPrint:` or `inputStream:`. The former is preferred if both properties are defined.
You can load, compile and fill a report using the standar JasperReports API, this plugin only provides a convenience
method to display a report using JRViewer.

[1]: http://jasperforge.org/projects/jasperreports
'''
}
