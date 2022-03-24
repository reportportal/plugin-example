import React from 'react';
import styles from './examplePluginTab.scss';

export const ExamplePluginTab = (props) => {
  const { meta: { requester = 'Mocked' } = {} } = props;
  const [counter, setCount] = React.useState(0);

  const increase = () => {
    setCount(counter + 1);
  };
  const decrease = () => {
    setCount(counter - 1);
  };

  return (
    <div className={styles.examplePluginTab}>
      Hello world! Hello, {requester}! <br />
      <button className={styles.button} onClick={increase}>
        Increase
      </button>
      <button className={styles.button} onClick={decrease}>
        Decrease
      </button>
      <br />
      Counter value: <span className={styles.text}>{counter}</span>
    </div>
  );
};
