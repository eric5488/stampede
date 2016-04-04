/*
 *     This file is part of ToroDB.
 *
 *     ToroDB is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     ToroDB is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with ToroDB. If not, see <http://www.gnu.org/licenses/>.
 *
 *     Copyright (c) 2014, 8Kdata Technology
 *     
 */

package com.torodb.torod.db.backends.converters.array;

import javax.json.JsonString;

import org.threeten.bp.LocalTime;

import com.torodb.torod.core.subdocument.values.ScalarTime;
import com.torodb.torod.core.subdocument.values.heap.LocalTimeScalarTime;

/**
 *
 */
public class TimeToArrayConverter implements ArrayConverter<JsonString, ScalarTime> {
    private static final long serialVersionUID = 1L;

    @Override
    public String toJsonLiteral(ScalarTime value) {
        return StringToArrayConverter.toJsonString(value.toString());
    }

    @Override
    public ScalarTime fromJsonValue(JsonString value) {
        return new LocalTimeScalarTime(LocalTime.parse(value.toString()));

    }
}
