# AnvilCraft: Example Addon

Affiliate used as an example/template.
It has no actual functionality and is for reference or learning purposes only.

If used as a template, the following parts need to be modified
(unless otherwise specified, only their values should be changed)
(the text inside angle brackets describes what should be filled in that position):

- [gradle.properties](./gradle.properties)
    - `mod_id`: mod ID
    - `mod_name`: mod name
    - `mod_description`: mod description
    - `mod_author`: mod author
    - `mod_version`: mod version
    - `mod_url`: mod URL; typically `https://github.com/<GitHub username>/<mod GitHub repository>/`
    - `maven_group`: Maven group ID; generally the Java package where the main class is located
    - `modrinth_id`: Modrinth ID; the project ID of **this mod** published on [Modrinth](https://modrinth.com/), leave blank if not published
    - `curseforge_id`: CurseForge ID; the project ID of **this mod** published on [CurseForge](https://www.curseforge.com/), leave blank if not published
- [LICENSE](./LICENSE)
    - Change the author name in the first line from `Various Author` to the name you want.
- [主类](./src/main/java/com/example/AnvilCraftExampleAddon.java)
    - Change its folder path from `project root/src/main/java/com/example/` to `project root/src/main/java/<maven_group, but replace "." with "/">`
    - Change its class name from `AnvilCraftExampleAddon` to the name you want, generally the `mod_name` with punctuation removed; it is recommended to use an IDE to rename it
    - `MOD_ID`: change its **value** to the **value** of the `mod_id` mentioned above
    - `MOD_NAME`: change its **value** to the **value** of the `mod_name` mentioned above
