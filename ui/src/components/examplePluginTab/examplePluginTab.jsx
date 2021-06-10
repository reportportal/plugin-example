import PlusMarkIcon from 'icons/plus-mark.svg';

export const ExamplePluginTab = (props) => {
  const {
    lib: { React, Parser },
  } = props;

  return (
    <div>
      <div style={{ width: '13px', height: '13px', marginRight: '13px' }}>
        {Parser(PlusMarkIcon)}
      </div>
      Hello world!
    </div>
  );
};
