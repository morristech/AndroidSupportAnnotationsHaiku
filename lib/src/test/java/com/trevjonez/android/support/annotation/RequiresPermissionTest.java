/*
 * Copyright (c) 2016. Trevor Jones
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.trevjonez.android.support.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author TrevJonez
 */
@RunWith(JUnit4.class)
public class RequiresPermissionTest {
  @Test
  public void classNameOutput() throws Exception {
    assertThat(RequiresPermission.CLASS_NAME.toString())
        .isEqualTo("android.support.annotation.RequiresPermission");
  }

  @Test
  public void specOutput() throws Exception {
    assertThat(RequiresPermission.SPEC.toString())
        .isEqualTo("@android.support.annotation.RequiresPermission");
  }

  @Test
  public void builder_value() throws Exception {
    assertThat(RequiresPermission.builder().value("$S", "SomePermissionString").build().toString())
        .isEqualTo("@android.support.annotation.RequiresPermission(\"SomePermissionString\")");
  }

  @Test
  public void builder_allOf() throws Exception {
    assertThat(RequiresPermission.builder().allOf("{$S}", "SomePermissionString").build().toString())
        .isEqualTo("@android.support.annotation.RequiresPermission(allOf = {\"SomePermissionString\"})");
  }

  @Test
  public void builder_anyOf() throws Exception {
    assertThat(RequiresPermission.builder().anyOf("{$S}", "SomePermissionString").build().toString())
        .isEqualTo("@android.support.annotation.RequiresPermission(anyOf = {\"SomePermissionString\"})");
  }

  @Test
  public void builder_conditional() throws Exception {
    assertThat(RequiresPermission.builder().conditional("$L", true).build().toString())
        .isEqualTo("@android.support.annotation.RequiresPermission(conditional = true)");
  }

  @RunWith(JUnit4.class)
  public static class ReadTest {
    @Test
    public void classNameOutput() throws Exception {
      assertThat(RequiresPermission.Read.CLASS_NAME.toString())
          .isEqualTo("android.support.annotation.RequiresPermission.Read");
    }

    @Test
    public void specOutput() throws Exception {
      assertThat(RequiresPermission.Read.SPEC.toString())
          .isEqualTo("@android.support.annotation.RequiresPermission.Read");
    }

    @Test
    public void value() throws Exception {
      assertThat(RequiresPermission.Read.value("$L", RequiresPermission.SPEC).toString())
          .isEqualTo("@android.support.annotation.RequiresPermission.Read(@android.support.annotation.RequiresPermission)");
    }
  }

  @RunWith(JUnit4.class)
  public static class WriteTest {
    @Test
    public void classNameOutput() throws Exception {
      assertThat(RequiresPermission.Write.CLASS_NAME.toString())
          .isEqualTo("android.support.annotation.RequiresPermission.Write");
    }

    @Test
    public void specOutput() throws Exception {
      assertThat(RequiresPermission.Write.SPEC.toString())
          .isEqualTo("@android.support.annotation.RequiresPermission.Write");
    }

    @Test
    public void value() throws Exception {
      assertThat(RequiresPermission.Write.value("$L", RequiresPermission.SPEC).toString())
          .isEqualTo("@android.support.annotation.RequiresPermission.Write(@android.support.annotation.RequiresPermission)");
    }
  }
}