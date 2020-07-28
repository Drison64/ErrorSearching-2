package me.drison64.errorsearching2;

import me.drison64.errorsearching2.Commands.cmdcunt;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("cunt").setExecutor(new cmdcunt());
    }
}
