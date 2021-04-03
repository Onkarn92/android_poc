/*
 * Created by Onkar Nene on 3/4/21 4:23 PM
 *
 * Copyright (c) 2021 Onkar Nene. All rights reserved.
 */

package com.onkarn92.androidpoc

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.*
import org.junit.Assert.*
import org.junit.runner.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
	
	@Test
	fun useAppContext() {
		// Context of the app under test.
		val appContext = InstrumentationRegistry.getInstrumentation().targetContext
		assertEquals("com.onkarn92.androidpoc", appContext.packageName)
	}
}