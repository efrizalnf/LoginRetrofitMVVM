package id.zlz.loginmvvm.responses

data class LoginResponse(
    val errors: Any,
    val message: String,
    val metadata: Metadata,
    val results: Results,
    val success: Boolean,
    val version: Int
)