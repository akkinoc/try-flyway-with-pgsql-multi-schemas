# try-flyway-with-postgres-multi-schemas

以下を試したいリポジトリ。

- Docker で PostgreSQL を複数スキーマで起動。
- Flyway (Gradle Kotlin DSL) による複数スキーマのデータベースマイグレーション。

## PostgreSQL 起動

とりあえず起動。
まだ public スキーマしか作られない。

```sh
docker compose -f ./docker/docker-compose.yml up --wait -d
```
