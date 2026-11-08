# Better Safe Bed — Modern Port for Minecraft 26.3 (Fabric)

![Mod loader: Fabric](https://img.shields.io/badge/modloader-Fabric-1976d2?style=for-the-badge)
![Minecraft: 26.3](https://img.shields.io/badge/Minecraft-26.3-green?style=for-the-badge)
![GitHub license](https://img.shields.io/github/license/Sekai0NI0itamio/BetterSafeBed263?style=for-the-badge)

**Sleep peacefully even when monsters lurk nearby out of reach.**

Normally, if a monster is within 8 blocks horizontally and 5 blocks
vertically from your bed, you get "You may not rest now, there are
monsters nearby" — even if that monster is in a cave beneath your
base, outside its walls, or on its roof, and could never reach you.

This mod adds an extra check: a monster only prevents resting if it
is actually targeting you. Sleep when you're safe.

Now with a **modern port for Minecraft 26.3 (Fabric)** — server-side
mechanism only, no GUI/render.

### What it does

- `Monster.isPreventingPlayerRest` returns true only when the monster
  targets that specific player
- Server-side; doesn't need to be on the client in multiplayer

### Modern port notes (26.3)

- Single-mixin port, same behaviour as the original
- Java 25 · Fabric Loader 0.20.1+ · Fabric API 0.165.0+26.3
- Built and verified in CI via GitHub Actions, including a headless
  runtime test that launches the client, joins a world, and quits cleanly

### Installation

1. Install Fabric Loader for Minecraft 26.3
2. Install Fabric API
3. Drop `bettersafebed263-*.jar` into your `mods` folder

### Original mod & credit

This is an unofficial modern port by **Itamio** of **Better Safe
Bed** by **frankV** — the original (1.1M downloads on Modrinth, last
updated for 1.21.7) has not been updated to 26.3.

- Original mod: https://modrinth.com/mod/better-safe-bed
- Original source: https://github.com/frank89722/BetterSafeBed
- License: MIT (Copyright © 2023 frankV) — see `LICENSE`

All credit for the original concept, design, and logic goes to
frankV. This port exists to bring it to Minecraft 26.3. See `NOTICE`.
