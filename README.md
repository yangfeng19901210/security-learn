底层架构路径
https://docs.spring.io/spring-security/reference/servlet/architecture.html

spring security 默认使用DefaultSecurityFilterChain 这个过滤器管理了16个过滤器完成认证和授权操作
2025-07-28T09:57:29.537+08:00 DEBUG 18156 --- [security-learn] [           main] o.s.s.web.DefaultSecurityFilterChain
: Will secure any request with filters:
DisableEncodeUrlFilter,
WebAsyncManagerIntegrationFilter,
SecurityContextHolderFilter,
HeaderWriterFilter,
CsrfFilter,
LogoutFilter,
UsernamePasswordAuthenticationFilter,
DefaultResourcesFilter,
DefaultLoginPageGeneratingFilter,
DefaultLogoutPageGeneratingFilter,
BasicAuthenticationFilter,
RequestCacheAwareFilter,
SecurityContextHolderAwareRequestFilter,
AnonymousAuthenticationFilter,
ExceptionTranslationFilter,
AuthorizationFilter