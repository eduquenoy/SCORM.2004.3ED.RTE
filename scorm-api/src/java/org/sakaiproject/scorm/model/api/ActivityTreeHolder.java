/**
 * Copyright (c) 2007 The Apereo Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://opensource.org/licenses/ecl2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sakaiproject.scorm.model.api;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

import org.adl.sequencer.SeqActivityTree;

public class ActivityTreeHolder implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Getter @Setter private Long id;
	@Getter @Setter private long contentPackageId;
	@Getter @Setter private String learnerId;
	@Getter @Setter private SeqActivityTree seqActivityTree;

	public ActivityTreeHolder() {}

	public ActivityTreeHolder(long contentPackageId, String learnerId)
	{
		this.contentPackageId = contentPackageId;
		this.learnerId = learnerId;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}

		if (obj == null)
		{
			return false;
		}

		if (getClass() != obj.getClass())
		{
			return false;
		}

		ActivityTreeHolder other = (ActivityTreeHolder) obj;
		if (id == null)
		{
			if (other.id != null)
			{
				return false;
			}
		}
		else if (!id.equals(other.id))
		{
			return false;
		}

		return true;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
}
