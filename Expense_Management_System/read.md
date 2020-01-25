This application has multi layer of data transform:

1. API
2. Controller
3. Service
4. Repository

-----------------------------------------------------------------

In API , we will have following format:

	@RequestMapping(value = "/<value>", method = RequestMethod.GET)
	public ResponseEntity<DTO> <method name>(@RequestParam("id") Integer id) throws Exception {
		DTO dto = null;
		try {
			dto = dtoController.<method>(id);
			log.info("FETCHING DTO BY ID SUCCESSFULLY WITH ID:" + id);
			ResponseEntity<DTO> resp = new ResponseEntity<>(dto, dtotus.OK);
			return resp;
		} catch (Exception e) {
			dto = new DTO();
			dto.setMessage(environment.getProperty(e.getMessage()));
			log.info("EXCEPTION OCCURED: " + e.getMessage());
			return new ResponseEntity<DTO>(dto, HttpStatus.BAD_REQUEST);
		}
	}
	
In this, we will make try catch block in which we will call contoller for dto

try catch block
log
controller
setMessage


-----------------------------------------------------------------------------------
In Controller,

	public Address getAddressByAddressId(Integer id) throws EmsException {
		AddressEntity addressEntity = null;
		Address address = null;
		try {
			addressEntity = addressServiceImpl.getAddressByAddressId(id);
			if (addressEntity != null)
				address = AddressTransformer.addressEntityToAddress(addressEntity);
		} catch (Exception e) {
			System.out.println("Exception Occured: " + e.getMessage());
			throw e;
		}
		return address;
	}
	
Here will convert DTOEntity to Entity using Transformer classes


------------------------------------------------------------------------------------
In service,

	public AddressEntity getAddressByAddressId(Integer id) throws EmsException{
		Optional<AddressEntity> addressEntity = null;
		addressEntity = addressRepository.findById(id);
		if(addressEntity.isPresent()) {
			System.out.println("-------------"+addressEntity.get().getAddressId());
			return addressEntity.get();
		}
		else
			throw new EmsException("AddressService.ADDRESS_NOT_FOUND_BY_ID");
	}
	
DTOEntity
check if present then send entity
if not then throw EmsException
	
----------------------------------------------------------------------------------------
In Repo,

	Nothing
