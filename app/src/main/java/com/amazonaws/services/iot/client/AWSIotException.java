/*
 * Copyright 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.client;

/**
 * This is a generic exception that can be thrown in most of the APIs, blocking
 * and non-blocking, by the library.
 */
public class AWSIotException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    private AWSIotDeviceErrorCode errorCode;


    /**
     * Instantiates a new exception object.
     *
     * @param message the error message
     */
    public AWSIotException(String message) {
        super(message);
    }

    /**
     * Instantiates a new exception object.
     *
     * @param errorCode the error code
     * @param message   the error message
     */
    public AWSIotException(AWSIotDeviceErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * Instantiates a new exception object.
     *
     * @param cause the cause. A null value is permitted, and indicates that the
     *              cause is nonexistent or unknown.
     */
    public AWSIotException(Throwable cause) {
        super(cause);
    }


    //region Getters and Setters

    /**
     * Error code for shadow methods. It's only applicable to exceptions thrown
     * by those shadow method APIs.
     *
     * @return the error code of the shadow method exception
     */
    public AWSIotDeviceErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Error code for shadow methods. It's only applicable to exceptions thrown
     * by those shadow method APIs.
     *
     * @param errorCode the new error code for the shadow method exception
     */
    public void setErrorCode(AWSIotDeviceErrorCode errorCode) {
        this.errorCode = errorCode;
    }
    //endregion
}