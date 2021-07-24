package id.zlz.loginmvvm.responses

data class User(
    val account_status: Int,
    val created_at: String,
    val email: String,
    val email_verified_at: Any,
    val id: Int,
    val institution: Institution,
    val is_rejected: Int,
    val is_services: Int,
    val issuance_by: Int,
    val issuance_status: Int,
    val name: String,
    val nik: Any,
    val passcode: Any,
    val passcode_expired: Any,
    val rejection_reason: Any,
    val role: Role,
    val updated_at: String
)