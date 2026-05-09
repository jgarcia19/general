import {useState, useEffect} from 'react';
import Table from 'react-bootstrap/Table';
import Button from 'react-bootstrap/Button';

function callApi() {
  fetch('http://localhost:8080/api/button', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json' 
    },
  })
  .then(response => response.json())
  .then(data => console.log(data))
  .catch(error => console.error('Error:', error));
}

function Phones() {
  const [phones, setPhones] = useState([]);

  useEffect(() => {
    fetch('https://api.restful-api.dev/objects')
      .then(response => response.json())
      .then(data => setPhones(data))
      .catch(error => console.error('Error fetching phones:', error));
  }, []);

  return (
    <div>
      <Table striped bordered hover>
        <thead>
          <tr>
            <th>Name</th>
            <th>Brand</th>
            <th>Price</th>
          </tr>
        </thead>
        <tbody>
          {phones.map(phone => (
            <tr key={phone.id}>
              <td>{phone.name}</td>
            </tr>
          ))}
        </tbody>
      </Table>


      <Button striped bordered onClick={() => {callApi()}}>Add Phone</Button>
    </div>
  );
}

export default Phones;
