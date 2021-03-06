/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.openejb.config;

import junit.framework.TestCase;

import java.util.Properties;

/**
 * @version $Rev$ $Date$
 */
public class ServiceUtilsTest extends TestCase {

    public void testImplies() throws Exception {

        final Properties properties = new Properties();
        properties.put("color", "blue");
        properties.put("size", "10");
        properties.put("weight", "100");
        properties.put("shape", "round");

        final Properties required = new Properties();
        required.put("color", "BLUE");

        assertTrue(ServiceUtils.implies(required, properties));

        // Add your code here
    }
}
