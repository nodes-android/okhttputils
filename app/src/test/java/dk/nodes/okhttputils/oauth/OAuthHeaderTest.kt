package dk.nodes.okhttputils.oauth

import com.google.common.truth.Truth.assertThat
import dk.nodes.okhttputils.oauth.entities.OAuthHeader
import org.junit.Test

class OAuthHeaderTest {

    @Test
    fun `When value() is called, Then value with prefix is returned`() {
        val oAuthHeader = OAuthHeader(name = "test_name", valuePrefix = "test_prefix")
        val accessToken = "test_access_token"
        val valueResult = oAuthHeader.value(accessToken)
        val expectedValueResult = "test_prefix$accessToken"

        assertThat(valueResult).isEqualTo(expectedValueResult)
    }
}