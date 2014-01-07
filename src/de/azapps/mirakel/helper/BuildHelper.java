/*******************************************************************************
 * Mirakel is an Android App for managing your ToDo-Lists
 * 
 * Copyright (c) 2013-2014 Anatolij Zelenin, Georg Semmler.
 * 
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     any later version.
 * 
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 * 
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package de.azapps.mirakel.helper;

import de.azapps.mirakel.Mirakel;
import de.azapps.mirakelandroid.BuildConfig;


public class BuildHelper {
	// public static boolean DEBUG=false;
	// private static boolean PLAYSTORE_RELEASE=false;
	public static boolean isBeta() {
		return !BuildConfig.DEBUG;
	}

	public static boolean isDebug(){
		return BuildConfig.DEBUG;
	}

	public static boolean isForFDroid() {
		//	return !PLAYSTORE_RELEASE;
		return !Mirakel.IS_PLAYSTORE;
	}

	public static boolean isForPlayStore() {
		//	return PLAYSTORE_RELEASE;
		return Mirakel.IS_PLAYSTORE;
	}

	public static boolean isNightly() {
		return !BuildConfig.DEBUG;
	}

	public static boolean isRelease() {
		return BuildConfig.DEBUG;
	}

	public static boolean useAutoUpdater() {
		return !(isForPlayStore() || isForFDroid());
	}
}
