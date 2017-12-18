package cc.zoyn.kotlincore

import org.bukkit.plugin.java.JavaPlugin

/**
 *
 *
 * @author Zoyn
 * @since 2017-12-19
 */
class Core : JavaPlugin() {

    override fun onEnable() {
        logger.info("test!")
    }

}