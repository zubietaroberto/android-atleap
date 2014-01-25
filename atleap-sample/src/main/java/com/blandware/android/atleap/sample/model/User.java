/*
 * Copyright (C) 2013 Blandware (http://www.blandware.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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

package com.blandware.android.atleap.sample.model;

/**
 * Created by agrebnev on 22.12.13.
 */

import com.blandware.android.atleap.sample.provider.SampleContract;
import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = SampleContract.User.TABLE)
public class User {

    @DatabaseField(id = true, columnName = SampleContract.User._ID)
    public int id;

    @DatabaseField(columnName = SampleContract.User.LOGIN)
    public String login;

    @SerializedName("avatar_url")
    @DatabaseField(columnName = SampleContract.User.AVATAR_URL)
    public String avatarUrl;

    @SerializedName("html_url")
    @DatabaseField(columnName = SampleContract.User.HTML_URL)
    public String htmlUrl;

    @DatabaseField(foreign = true, columnName = SampleContract.User.REPOSITORY_ID)
    public Repository repository;


}