
JasperReports integration
-------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/jasperreports](http://artifacts.griffon-framework.org/plugin/jasperreports)


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

