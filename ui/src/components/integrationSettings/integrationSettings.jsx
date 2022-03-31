import React from 'react';
import { IntegrationFormFields } from '../integrationFormFields';

export const IntegrationSettings = (props) => {
  const { data, goToPreviousPage, onUpdate, isGlobal, ...extensionProps } = props;
  const {
    // TODO: share it from the core via WMF
    components: { IntegrationSettings: IntegrationSettingsContainer },
  } = extensionProps;

  return (
    <IntegrationSettingsContainer
      data={data}
      onUpdate={onUpdate}
      goToPreviousPage={goToPreviousPage}
      isGlobal={isGlobal}
      formFieldsComponent={(rest) => <IntegrationFormFields {...extensionProps} {...rest} />}
    />
  );
};
