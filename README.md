# try-flyway-with-postgres-multi-schemas

以下を試したいリポジトリ。

- Docker で PostgreSQL を複数スキーマで起動。
- Flyway (Gradle Kotlin DSL) による複数スキーマのデータベースマイグレーション。
- jOOQ で複数スキーマのコード生成。

## PostgreSQL 起動

```sh
docker compose -f ./docker/docker-compose.yml up --wait -d
```

- PostgreSQL が起動される。
- 複数スキーマが作成できる。

## Flyway クリーンマイグレーション

```sh
gradle flywayClean flywayMigrate flywayInfo
```

- Flyway のクリーンマイグレーションが実行される。
- 各スキーマにテーブルが作成できる。

## jOOQ コード生成

```sh
gradle jooqCodegen
```

- jOOQ のコードが生成される。
- jOOQ コードにはスキーマ指定も含まれている。
