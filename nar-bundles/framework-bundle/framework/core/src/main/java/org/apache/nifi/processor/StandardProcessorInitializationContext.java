/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.processor;

import org.apache.nifi.controller.ControllerServiceLookup;
import org.apache.nifi.controller.service.ControllerServiceProvider;
import org.apache.nifi.logging.ProcessorLog;

public class StandardProcessorInitializationContext implements ProcessorInitializationContext {

    private final String identifier;
    private final ProcessorLog logger;
    private final ControllerServiceProvider serviceProvider;

    public StandardProcessorInitializationContext(final String identifier, final ProcessorLog processorLog, final ControllerServiceProvider serviceProvider) {
        this.identifier = identifier;
        this.logger = processorLog;
        this.serviceProvider = serviceProvider;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public ProcessorLog getLogger() {
        return logger;
    }

    @Override
    public ControllerServiceLookup getControllerServiceLookup() {
        return serviceProvider;
    }
}
