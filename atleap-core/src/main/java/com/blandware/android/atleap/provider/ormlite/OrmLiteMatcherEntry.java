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

package com.blandware.android.atleap.provider.ormlite;

import com.blandware.android.atleap.provider.sqlite.SQLiteMatcherEntry;

/**
* This class adds possibility to store mapping between Uri path and Class of ER model of ORMLite.
*/
public class OrmLiteMatcherEntry extends SQLiteMatcherEntry {

    /**
     * {@inheritDoc}
     */
    public OrmLiteMatcherEntry(String authority, String path) {
        super(authority, path);
    }

    /**
     * {@inheritDoc}
     */
    public OrmLiteMatcherEntry(String authority, String path, Type baseType, String subType) {
        super(authority, path, baseType, subType);

    }

    private Class clazz;

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}
