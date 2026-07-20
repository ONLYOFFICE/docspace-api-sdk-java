# Change Log

## 3.7.0

### Added

- Added new API methods for AI settings, wallet/payment operations, room external
  sharing & DB sync, file uploads, and webhook triggers
- Added corresponding request/response models (DTOs and wrappers)
- Added rate limit documentation (`X-RateLimit-*` and `Retry-After` headers) to API docs
- Added tag Rooms / Groups

### Changed

- Updated SDK OpenAPI specification to v3.7.0
- Adjusted method return types and renamed several payment/TFA methods
- Updated example values and added email length validation in API models

### Fixed

- Fixed & / ' issues

## 3.6.0

- Initial release
- SDK regenerated from OpenAPI specification v3.6.0