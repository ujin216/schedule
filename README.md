# schedule
### API 명세
|API명세|Method|URL|
|--------|-----|---------------------|
|회원 생성|POST|/members|
|회원 조회|GET|/members|
|회원 단건조회|GET|/members/{memberId}|
|회원 수정|PATCH|/members/{memberId}|
|회원 삭제|DELETE|/members/{memberId}

### ERD
#### schedules
|컬럼이름|데이터타입|키|null허용|설명|
|-----------|-----------------|--|----|
|id|BIGINT|PK(auto_increment)|N|식별자|
|title||VARCHAR(20)|-|N|할일|
|memberld|BIGINT|FK|Y|유저 테이블|
|created_at|DATETIME|-|N|생성일|
|updated_at|DATETIME|-|N|수정일|
#### members
|컬럼이름|데이터타입|키|null허용|설명|
|-----------|-----------------|--|----|
|id|BIGINT|PK(auto_increment)|N|식별자|
|title||VARCHAR(20)|-|N|유저 이름|
|memberld|VARCHAR(255)|-|N|비밀번호|
|created_at|DATETIME|-|N|생성일|
|updated_at|DATETIME|-|N|수정일|
