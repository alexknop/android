/*
 * Nextcloud - Android Client
 *
 * SPDX-FileCopyrightText: 2024 Your Name <your@email.com>
 * SPDX-License-Identifier: AGPL-3.0-or-later
 */

package com.owncloud.android.utils.appConfig

/**
 * These keys are connected to app_config.xml
 */
enum class AppConfigKeys(val key: String) {
    ProxyHost("proxy_host"),
    ProxyPort("proxy_port")
}
