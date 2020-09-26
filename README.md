# tempbot
Temporary Macros for TPH

**To Authorize:** https://discord.com/api/oauth2/authorize?client_id=759325876633993216&permissions=3072&scope=bot

**Available Macros**
++ask, ++askbetterfirst, ++bin, ++imageofcode, ++noresearch, ++patience, ++wrapcode, ++wrapmini, ++xyproblem

**Build img from src**
- Build shadowJar
- run `docker build . --build-arg argToken=BOT_TOKEN`

**Build img from GitHub**
`cd /Dockerfiles/from-github`
`docker build . --build-arg argToken=BOT_TOKEN`

*note* bot token is accessible via build history, do not deploy image to public domain