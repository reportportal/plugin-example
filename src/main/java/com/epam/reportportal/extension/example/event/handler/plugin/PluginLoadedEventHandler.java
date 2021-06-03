package com.epam.reportportal.extension.example.event.handler.plugin;

import com.epam.reportportal.extension.event.PluginEvent;
import com.epam.reportportal.extension.example.event.handler.EventHandler;
import com.epam.reportportal.extension.example.info.PluginInfoProvider;
import com.epam.ta.reportportal.dao.IntegrationTypeRepository;
import com.epam.ta.reportportal.entity.integration.IntegrationType;

/**
 * @author <a href="mailto:ivan_budayeu@epam.com">Ivan Budayeu</a>
 */
public class PluginLoadedEventHandler implements EventHandler<PluginEvent> {

	private final IntegrationTypeRepository integrationTypeRepository;
	private final PluginInfoProvider pluginInfoProvider;

	public PluginLoadedEventHandler(IntegrationTypeRepository integrationTypeRepository, PluginInfoProvider pluginInfoProvider) {
		this.integrationTypeRepository = integrationTypeRepository;
		this.pluginInfoProvider = pluginInfoProvider;
	}

	@Override
	public void handle(PluginEvent event) {
		integrationTypeRepository.findByName(event.getPluginId()).ifPresent(integrationType -> {
			final IntegrationType result = pluginInfoProvider.provide(integrationType);
			integrationTypeRepository.save(result);
		});
	}

}
