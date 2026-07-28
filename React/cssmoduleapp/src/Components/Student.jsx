import styles from "./Student.module.css";

function Student() {
  return (
    <div className={styles.box}>
      <h2 className={styles.title}>Student Details</h2>

      <p>Name: Abishek</p>
      <p>Department: ECE</p>
      <p>College: Vel Tech Engineering College</p>
    </div>
  );
}

export default Student;~