package com.epam.reportportal.extension.example.command.adapter;

import com.epam.reportportal.extension.CommonPluginCommand;
import com.epam.reportportal.extension.PluginCommand;

import java.util.Map;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
public class PluginCommandAdapter<T> implements CommonPluginCommand<T> {

	private final PluginCommand<T> delegate;

	public PluginCommandAdapter(PluginCommand<T> delegate) {
		this.delegate = delegate;
	}

	@Override
	public T executeCommand(Map<String, Object> params) {
		return delegate.executeCommand(null, params);
	}

	@Override
	public String getName() {
		return delegate.getName();
	}
}
