package com.massivecraft.factions.util;

import org.bukkit.configuration.file.YamlConfiguration;
import com.massivecraft.factions.P;
import java.io.File;

@SuppressWarnings("unused")
public class FocusFile {

    private final P main;
    public final YamlConfiguration data = new YamlConfiguration();
    private final File focusFile;

    public SMSFile(Main main) {
        this.main = main;
        focusFile = new File(main.getDataFolder(), "focus.yml");
        if (!focusFile.exists())
            try {
                focusFile.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        load();
    }

    public void save() {
        try {
            data.save(focusFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            data.load(focusFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
