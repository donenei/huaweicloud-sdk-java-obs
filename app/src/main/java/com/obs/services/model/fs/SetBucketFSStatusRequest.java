/**
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.obs.services.model.fs;

/**
 * Parameters in a request for setting status of the file gateway feature for a bucket 
 *
 */
public class SetBucketFSStatusRequest {
	
	private String bucketName;
	
	private FSStatusEnum status;
	
	public SetBucketFSStatusRequest() {
		
	}
	
	/**
	 * Constructor
	 * @param bucketName Bucket name
	 * @param status Status of the file gateway feature
	 */
	public SetBucketFSStatusRequest(String bucketName, FSStatusEnum status) {
		super();
		this.bucketName = bucketName;
		this.setStatus(status);
	}

	/**
	 * Obtain the bucket name.
	 * @return Bucket name
	 */
	public String getBucketName() {
		return bucketName;
	}

	/**
	 * Set the bucket name.
	 * @param bucketName Bucket name
	 */
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	/**
	 * Obtain the status of the file gateway feature of a bucket. 
	 * @return Status of the file gateway feature 
	 */
	public FSStatusEnum getStatus() {
		return status;
	}

	/**
	 * Set status of the file gateway feature for a bucket. 
	 * @param status Status of the file gateway feature
	 */
	public void setStatus(FSStatusEnum status) {
		this.status = status;
	}


	
}


