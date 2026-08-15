# 铁砧工艺：示例附属

用作示例/模板的附属。

没有实际功能，仅供参考或学习。


若用于模板，则有以下部分需要修改（除非特别说明，否则都只应修改它的值）（尖括号内的文字为其位置应填写的东西的描述）：

- [gradle.properties](./gradle.properties)
  - `mod_id`：模组 ID
  - `mod_name`：模组名称
  - `mod_description`：模组描述
  - `mod_author`：模组作者
  - `mod_version`：模组版本
  - `mod_url`：模组 URL；一般为 `https://github.com/<Github用户名>/<模组Github仓库>/`
  - `maven_group`：Maven 群组 ID；一般为主类所在的 Java 包
  - `modrinth_id`：Modrinth ID；为**该模组**在 [Modrinth](https://modrinth.com/) 上发布的项目 ID，不发布则无需填写
  - `curseforge_id`：CurseForge ID；为**该模组**在 [CurseForge](https://www.curseforge.com/) 上发布的项目 ID，不发布则无需填写
- [LICENSE](./LICENSE)
  - 将第一行的作者名从 `Various Author` 改为你想要的名称
- [主类](./src/main/java/com/example/AnvilCraftExampleAddon.java)
  - 将其文件夹路径从 `仓库根目录/src/main/java/com/example/` 改为 `仓库根目录/src/main/java/<maven_group，但是将“.”替换为“/”>`
  - 将其类名从 `AnvilCraftExampleAddon` 改为你想要的名称，一般为去除标点符号的 `mod_name`；建议使用 IDE 进行重命名
  - `MOD_ID`：将其**值**改为上文 `mod_id` 的**值**
  - `MOD_NAME`：将其**值**改为上文 `mod_name` 的**值**
