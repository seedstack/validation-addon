/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.validation.internal;

import org.seedstack.validation.internal.pojo.FieldValidationOK;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seedstack.seed.it.SeedITRunner;

import javax.inject.Inject;

@RunWith(SeedITRunner.class)
public class FieldValidationOkIT {

    @Inject
    FieldValidationOK serviceField;

    @Test
    public void trigger() {
        Assertions.assertThat(serviceField).isNotNull();
    }

}
