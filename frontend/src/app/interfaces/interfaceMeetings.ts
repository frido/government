interface ResponseMeetings {
  data: Meeting[];
}

interface Meeting {
  id: number;
  council: number;
  datum: string;
  cas: string;
  miesto: string;
}
