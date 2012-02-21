/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package griffon.plugins.jasperreports.factory

import groovy.swing.factory.ComponentFactory
import net.sf.jasperreports.swing.JRViewer
import net.sf.jasperreports.engine.JasperPrint

/**
 * @author Andres Almiray
 */
class ReportViewerFactory extends ComponentFactory {
    ReportViewerFactory(){
        super(JRViewer)
    }

    Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) 
        throws InstantiationException, IllegalAccessException {
        JasperPrint jasperPrint = attributes.remove('jasperPrint')
        InputStream is          = attributes.remove('inputStream')
        boolean isXML           = attributes.remove('isXml') ?: false
        Locale locale           = attributes.remove('locale')
        ResourceBundle rs       = attributes.remove('resourceBundle')
        
        if(jasperPrint) {
            return new JRViewer(jasperPrint, locale, rs)
        } else if(is) {
            return new JRViewer(is, isXml, locale, rs)
        }
        throw new IllegalArgumentException("In $name, you must define either jasperPrint: or inputStream:")
    }
}