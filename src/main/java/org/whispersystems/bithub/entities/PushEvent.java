/**
 * Copyright (C) 2013 Open WhisperSystems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.whispersystems.bithub.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PushEvent {

  @JsonProperty
  private String head;

  @JsonProperty
  private String ref;

  @JsonProperty
  private int size;

  @JsonProperty
  @NotNull
  List<Commit> commits;

  @JsonProperty
  @NotNull
  Repository repository;

  public Repository getRepository() {
    return repository;
  }

  public String getHead() {
    return head;
  }

  public String getRef() {
    return ref;
  }

  public int getSize() {
    return size;
  }

  public List<Commit> getCommits() {
    return commits;
  }

}
