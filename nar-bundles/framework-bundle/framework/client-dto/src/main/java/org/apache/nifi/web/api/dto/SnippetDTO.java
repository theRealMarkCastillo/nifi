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
package org.apache.nifi.web.api.dto;

import java.util.HashSet;
import java.util.Set;
import javax.xml.bind.annotation.XmlType;

/**
 * The contents of a snippet of a flow.
 */
@XmlType(name = "snippet")
public class SnippetDTO {

    private String id;
    private String uri;
    private String parentGroupId;
    private Boolean linked;

    // when specified these are only considered during creation
    private Set<String> processGroups = new HashSet<>();
    private Set<String> remoteProcessGroups = new HashSet<>();
    private Set<String> processors = new HashSet<>();
    private Set<String> inputPorts = new HashSet<>();
    private Set<String> outputPorts = new HashSet<>();
    private Set<String> connections = new HashSet<>();
    private Set<String> labels = new HashSet<>();
    private Set<String> funnels = new HashSet<>();

    private FlowSnippetDTO contents;

    /**
     * The id of this snippet.
     *
     * @return
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The uri of this snippet.
     *
     * @return
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * The group id for the components in this snippet.
     *
     * @return
     */
    public String getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(String parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    /**
     * Whether or not this snippet is linked to the underlying data flow.
     *
     * @return
     */
    public Boolean isLinked() {
        return linked;
    }

    public void setLinked(Boolean linked) {
        this.linked = linked;
    }

    /**
     * The ids of the connections in this snippet. These ids will be populated
     * within each response. They can be specified when creating a snippet.
     * However, once a snippet has been created its contents cannot be modified
     * (these ids are ignored during update requests).
     *
     * @return
     */
    public Set<String> getConnections() {
        return connections;
    }

    public void setConnections(Set<String> connections) {
        this.connections = connections;
    }

    /**
     * The ids of the funnels in this snippet. These ids will be populated
     * within each response. They can be specified when creating a snippet.
     * However, once a snippet has been created its contents cannot be modified
     * (these ids are ignored during update requests).
     *
     * @param funnels
     */
    public Set<String> getFunnels() {
        return funnels;
    }

    public void setFunnels(Set<String> funnels) {
        this.funnels = funnels;
    }

    /**
     * The ids of the input port in this snippet. These ids will be populated
     * within each response. They can be specified when creating a snippet.
     * However, once a snippet has been created its contents cannot be modified
     * (these ids are ignored during update requests).
     *
     * @return
     */
    public Set<String> getInputPorts() {
        return inputPorts;
    }

    public void setInputPorts(Set<String> inputPorts) {
        this.inputPorts = inputPorts;
    }

    /**
     * The ids of the labels in this snippet. These ids will be populated within
     * each response. They can be specified when creating a snippet. However,
     * once a snippet has been created its contents cannot be modified (these
     * ids are ignored during update requests).
     *
     * @return
     */
    public Set<String> getLabels() {
        return labels;
    }

    public void setLabels(Set<String> labels) {
        this.labels = labels;
    }

    /**
     * The ids of the output ports in this snippet. These ids will be populated
     * within each response. They can be specified when creating a snippet.
     * However, once a snippet has been created its contents cannot be modified
     * (these ids are ignored during update requests).
     *
     * @return
     */
    public Set<String> getOutputPorts() {
        return outputPorts;
    }

    public void setOutputPorts(Set<String> outputPorts) {
        this.outputPorts = outputPorts;
    }

    /**
     * The ids of the process groups in this snippet. These ids will be
     * populated within each response. They can be specified when creating a
     * snippet. However, once a snippet has been created its contents cannot be
     * modified (these ids are ignored during update requests).
     *
     * @return
     */
    public Set<String> getProcessGroups() {
        return processGroups;
    }

    public void setProcessGroups(Set<String> processGroups) {
        this.processGroups = processGroups;
    }

    /**
     * The ids of the processors in this snippet. These ids will be populated
     * within each response. They can be specified when creating a snippet.
     * However, once a snippet has been created its contents cannot be modified
     * (these ids are ignored during update requests).
     *
     * @return
     */
    public Set<String> getProcessors() {
        return processors;
    }

    public void setProcessors(Set<String> processors) {
        this.processors = processors;
    }

    /**
     * The ids of the remote process groups in this snippet. These ids will be
     * populated within each response. They can be specified when creating a
     * snippet. However, once a snippet has been created its contents cannot be
     * modified (these ids are ignored during update requests).
     *
     * @return
     */
    public Set<String> getRemoteProcessGroups() {
        return remoteProcessGroups;
    }

    public void setRemoteProcessGroups(Set<String> remoteProcessGroups) {
        this.remoteProcessGroups = remoteProcessGroups;
    }

    /**
     * The contents of the configuration for this snippet.
     *
     * @return
     */
    public FlowSnippetDTO getContents() {
        return contents;
    }

    public void setContents(FlowSnippetDTO contents) {
        this.contents = contents;
    }

}
