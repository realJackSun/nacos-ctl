package com.alibaba.nacos.cli.commands.watch.config;

import com.alibaba.nacos.cli.core.LogicHandler;
import picocli.CommandLine;

import static com.alibaba.nacos.cli.utils.HintUtils.DESCRIPTION_HEADING;
import static com.alibaba.nacos.cli.utils.HintUtils.HEADER_HEADING;
import static com.alibaba.nacos.cli.utils.HintUtils.NAME_ADD;
import static com.alibaba.nacos.cli.utils.HintUtils.OPTION_LIST_HEADING;
import static com.alibaba.nacos.cli.utils.HintUtils.PARAMETER_LIST_HEADING;
import static com.alibaba.nacos.cli.utils.HintUtils.SORT_OPTIONS;
import static com.alibaba.nacos.cli.utils.HintUtils.SYNOPSIS_HEADING;

/**
 * add config listener
 *
 * @author lehr
 */
@CommandLine.Command(name = NAME_ADD, sortOptions = SORT_OPTIONS, headerHeading = HEADER_HEADING, synopsisHeading = SYNOPSIS_HEADING, descriptionHeading = DESCRIPTION_HEADING, parameterListHeading = PARAMETER_LIST_HEADING, optionListHeading = OPTION_LIST_HEADING, header = "add a watcher", description = "Add a watcher.")
@Deprecated
public class NacosWatchConfigAdd implements Runnable {
    
    @CommandLine.Parameters(paramLabel = "<group>", description = "Configuration group.")
    String group;
    
    @CommandLine.Parameters(paramLabel = "<dataId>", description = "Configuration ID.")
    String dataId;
    
    @Override
    public void run() {
        
        System.out.println(LogicHandler.watchConfig(dataId, group));
        
    }
}
