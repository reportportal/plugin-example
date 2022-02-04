package com.epam.reportportal.extension.example.command.connection;

import com.epam.reportportal.extension.PluginCommand;
import com.epam.ta.reportportal.entity.integration.Integration;

import java.util.Map;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
public class TestConnectionCommand implements PluginCommand<Boolean> {
	@Override
	public String getName() {
		return "testConnection";
	}

	@Override
	public Boolean executeCommand(Integration integration, Map<String, Object> params) {
		return true;
	}
}
