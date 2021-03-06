/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.activiti.engine.impl.pvm;

import java.io.Serializable;


/**
 * @author Tom Baeyens
 * 定义了 获取 id(流程文档中的元素id值 )
 * 获取PvmProcessDefinition 实例 ,获取属性值的()
 *
 */
public interface PvmProcessElement extends Serializable {

  String getId();
  
  PvmProcessDefinition getProcessDefinition();
  
  Object getProperty(String name);

}
