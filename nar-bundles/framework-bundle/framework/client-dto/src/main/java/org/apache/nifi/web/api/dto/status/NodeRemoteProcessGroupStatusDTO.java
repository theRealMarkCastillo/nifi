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
package org.apache.nifi.web.api.dto.status;

import javax.xml.bind.annotation.XmlType;
import org.apache.nifi.web.api.dto.NodeDTO;

/**
 * DTO for serializing the remote process group status for a particular node.
 */
@XmlType(name = "nodeRemoteProcessGroupStatus")
public class NodeRemoteProcessGroupStatusDTO {

    private NodeDTO node;
    private RemoteProcessGroupStatusDTO remoteProcessGroupStatus;

    /**
     * The node.
     *
     * @return
     */
    public NodeDTO getNode() {
        return node;
    }

    public void setNode(NodeDTO node) {
        this.node = node;
    }

    /**
     * The remote process group's status.
     *
     * @return
     */
    public RemoteProcessGroupStatusDTO getRemoteProcessGroupStatus() {
        return remoteProcessGroupStatus;
    }

    public void setRemoteProcessGroupStatus(RemoteProcessGroupStatusDTO remoteProcessGroupStatus) {
        this.remoteProcessGroupStatus = remoteProcessGroupStatus;
    }

}
