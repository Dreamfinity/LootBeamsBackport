[![availableFor](https://cf.way2muchnoise.eu/versions/loot-beams-backport.svg)](https://www.curseforge.com/minecraft/mc-mods/loot-beams-backport) 
[![title](https://cf.way2muchnoise.eu/title/loot-beams-backport.svg)](https://www.curseforge.com/minecraft/mc-mods/loot-beams-backport)
[![Discord](https://img.shields.io/discord/157892343163387904?color=5865F2&label=Discord)](https://discord.gg/weChv5cF)
# Loot Beams Backport
## Backport of shiroroku's Loot Beams to 1.7.10
## Example of in-world work:
<details><summary>Huge GIF inside</summary>

![Example](./media/lootbeamsbackport_30.gif)

</details>

## Configurable options:
```
"Beam settings" {
    # Beam diameter [range: 0.05 ~ 3.0, default: 0.25] - stick in world has width 1, so u can rely in it
    S:beamDiameter=0.25

    # Beam height (in blocks) [range: 0.5 ~ 32.0, default: 4.0] - height in blocks
    S:beamHeight=4

    # Render beam above items or not [default: true] - do you want beams to be rendered
    B:needRenderBeam=true

    # Use high-res (256x256) beam texture or low-res(16x16) [default: true] 
    B:useHighResBeam=true

    # Rotate beam over time (like beacon's beam) [default: true]
    B:useRotatingBeam=true
    
    # Float beam over time [default: true]
    B:useFloatingBeam=true
}
```

#### Repo & build info:
Almost all dependencies must exist at [CloudRep](https://cloudrep.veritaris.me/repos). 
If something is missing - pls contact with me via 
[VK](https://vk.me/veritaris), 
[Telegram](tg://resolve?domain=Veritaris) or 
email (georgiiimeshkenov@gmail.com)