package cc.zoyn.kotlincore.util

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.util.function.Consumer

/**
 * 基础工具类
 *
 * @author Zoyn
 * @since 2017-12-19
 */
object BasicUtils {

    /**
     * get server all online players
     */
    fun getOnlinePlayers(): List<Player> {
        val playerList = arrayListOf<Player>()
        val worldList = Bukkit.getWorlds()

        worldList.forEach(Consumer { world -> if (!world.players.isEmpty()) playerList.addAll(world.players) })
        return playerList
    }
}