/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.amazonaws.services.opsworks.waiters;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import com.amazonaws.services.opsworks.model.DescribeDeploymentsRequest;
import com.amazonaws.services.opsworks.model.DescribeDeploymentsResult;
import com.amazonaws.services.opsworks.AWSOpsWorks;

@SdkInternalApi
public class DescribeDeploymentsFunction implements SdkFunction<DescribeDeploymentsRequest, DescribeDeploymentsResult> {

    /**
     * Represents the service client
     */
    private final AWSOpsWorks client;

    /**
     * Constructs a new DescribeDeploymentsFunction with the given client
     * 
     * @param client
     *        Service client
     */
    public DescribeDeploymentsFunction(AWSOpsWorks client) {
        this.client = client;
    }

    /**
     * Makes a call to the operation specified by the waiter by taking the corresponding request and returns the
     * corresponding result
     * 
     * @param describeDeploymentsRequest
     *        Corresponding request for the operation
     * @return Corresponding result of the operation
     */
    @Override
    public DescribeDeploymentsResult apply(DescribeDeploymentsRequest describeDeploymentsRequest) {
        return client.describeDeployments(describeDeploymentsRequest);
    }
}
