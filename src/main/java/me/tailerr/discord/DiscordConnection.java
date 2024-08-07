package me.tailerr.discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class DiscordConnection {
    private JDA jda;

    public DiscordConnection(String BOT_TOKEN) {

        try {
            jda = JDABuilder.create(BOT_TOKEN,
                            GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_MESSAGES)
                    .build().awaitReady();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
